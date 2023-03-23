import "./mplayer.css";
import React, { useState, useEffect } from "react";
import { Button, ProgressBar, Form, Modal } from "react-bootstrap";
import { proxy as apiUrl } from '../../../package.json';

function MediaPlayer() {
  const [currentMediaIndex, setCurrentMediaIndex] = useState(0);
  const [playlists, setPlaylists] = useState([]);
  const [currentPlaylist, setCurrentPlaylist]= useState([])
  const [currentMedia, setCurrentMedia] = useState([]);
  const [isPlaying, setIsPlaying] = useState(false);
  const [showPlaylistModal, setShowPlaylistModal] = useState(false);

  useEffect(() => {
    fetch(`${apiUrl}/playlists`)
      .then((response) => response.json())
      .then((data) => setPlaylists(data));
  }, []);


  function handlePlayClick() {
    setIsPlaying(true);
  }

  function handlePlaylistSelect(event) {
    setCurrentPlaylist(playlists[event.target.value]);
    setCurrentMedia(playlists[event.target.value].musicas[0]);
    setCurrentMediaIndex(0);
  }

  function handleNextClick() {
    if (currentMediaIndex > currentPlaylist.musicas.length - 1) {
      setCurrentMedia(currentPlaylist.musicas[0]);
      setCurrentMediaIndex(0);
    } else {
      setCurrentMediaIndex(currentMediaIndex + 1);
      setCurrentMedia(currentPlaylist.musicas[currentMediaIndex]);
    }
  }

  function handlePrevClick() {
    console.log(currentMediaIndex);
    if (currentMediaIndex > -1) {
      setCurrentMedia(currentPlaylist.musicas[currentMediaIndex]);
      setCurrentMediaIndex(currentMediaIndex -1);
    } else {
      setCurrentMediaIndex(currentPlaylist.musicas.length - 1);
      setCurrentMedia(currentPlaylist.musicas[currentPlaylist.musicas.length - 1]);
    }
  }

  function handleStopClick() {
    setIsPlaying(false);
  }

  function handlePlaylistModalOpen() {
    setShowPlaylistModal(true);
  }

  function handlePlaylistModalClose() {
    setShowPlaylistModal(false);
  }

  return (
    <div className="player-container">
     
    <h4>Playlist: {currentPlaylist?.nome} </h4>
      <h4>Mídia: {currentMedia?.titulo} </h4>
      <h4>Gênero: {currentMedia?.genero} </h4>
     
      <div className="progress-container">
        <ProgressBar now={60} label={`${60}%`} />
      </div>
      <Button variant="secondary" onClick={handlePrevClick}>
        Prev
      </Button>{" "}
      <Button variant="primary" onClick={handlePlayClick}>
        {isPlaying ? "Pause" : "Play"}
      </Button>{" "}
      <Button variant="secondary" onClick={handleNextClick}>
        Next
      </Button>{" "}
      <Button variant="danger" onClick={handleStopClick}>
        Stop
      </Button>{" "}
      <Button variant="secondary" onClick={handlePlaylistModalOpen}>
        Playlist
      </Button>
      <Modal show={showPlaylistModal} onHide={handlePlaylistModalClose}>
        <Modal.Header closeButton>
          <Modal.Title>Lista de reprodução</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form.Control as="select" onChange={handlePlaylistSelect}>
            {playlists.map((playlist, index) => (
              <option key={index} value={index}>
                {playlist.nome}
              </option>
            ))}
          </Form.Control>
        </Modal.Body>
      </Modal>
    </div>
  );
}

export default MediaPlayer;
