import "./mplayer.css";
import React, { useState, useEffect } from "react";
import { Button, ProgressBar, Form, Modal } from "react-bootstrap";


function MediaPlayer() {
  const [playlists, setPlaylists] = useState([]);
  const [currentPlaylistIndex, setCurrentPlaylistIndex] = useState(0);
  const [mediaList, setMediaList] = useState([]);
  const [currentMediaIndex, setCurrentMediaIndex] = useState(0);
  const [isPlaying, setIsPlaying] = useState(false);
  const [showPlaylistModal, setShowPlaylistModal] = useState(false);

  useEffect(() => {
    fetch("url-da-api/playlists")
      .then((response) => response.json())
      .then((data) => setPlaylists(data));
  }, []);

  useEffect(() => {
    fetch(`url-da-api/playlists/${currentPlaylistIndex}/media`)
      .then((response) => response.json())
      .then((data) => setMediaList(data));
  }, [currentPlaylistIndex]);

  function handlePlayClick() {
    setIsPlaying(true);
  }

  function handlePlaylistSelect(event) {
    setCurrentPlaylistIndex(event.target.value);
    setCurrentMediaIndex(0);
  }

  function handleNextClick() {
    if (currentMediaIndex === mediaList.length - 1) {
      setCurrentMediaIndex(0);
    } else {
      setCurrentMediaIndex(currentMediaIndex + 1);
    }
  }

  function handlePrevClick() {
    if (currentMediaIndex === 0) {
      setCurrentMediaIndex(mediaList.length - 1);
    } else {
      setCurrentMediaIndex(currentMediaIndex - 1);
    }
  }

  function handleStopClick() {
    setIsPlaying(false);
    setCurrentMediaIndex(0);
  }

  function handlePlaylistModalOpen() {
    setShowPlaylistModal(true);
  }

  function handlePlaylistModalClose() {
    setShowPlaylistModal(false);
  }

  return (
    <div class="player-container">
      <h2>{mediaList[currentMediaIndex]?.name}</h2>
      <h4>Playlist: {playlists[currentPlaylistIndex]?.name}</h4>
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
                {playlist.name}
              </option>
            ))}
          </Form.Control>
        </Modal.Body>
      </Modal>
    </div>
  );
}

export default MediaPlayer;
