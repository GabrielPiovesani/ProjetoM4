import React, { useState, useEffect } from "react";
import { Container, Row, Col, Tabs, Tab, Card, Button } from 'react-bootstrap';
import Breakin from "../../assets/img/Serie/breakingbad.jpg"
import StrangerThings from "../../assets/img/Serie/StrangerThings.jpg"
import Reacher from "../../assets/img/Serie/Reacher.jpg"
import You from "../../assets/img/Serie/You.jpg"
import Avatar from "../../assets/img/Serie/Avatar.jpg"
import jogadorN1 from "../../assets/img/Serie/jogadorN1.jpg"
import img from "../../assets/img/fundoImg.png"
import Quando from "../../assets/img/Musica/Quando.jpg"
import { proxy as apiUrl } from '../../../package.json';


export default function MediaCatalogo() {
  // Defina o estado inicial dos dados da galeria de mídias


  const [series, setSeries] = useState([
    {
      id: 1,
      title: "Breaking Bad",
      image: Breakin,
      description:
        "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.",
    },
    {
      id: 2,
      title: "Stranger Things",
      image: StrangerThings,
      description:
        "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying supernatural forces in order to get him back.",
      },
    {
      id: 3,
      title: "Reacher",
      image: Reacher,
      description:
      "O investigador veterano da polícia militar Jack Reacher é falsamente acusado de assassinato e se vê no meio de uma conspiração mortal em Margrave, Geórgia.",
    },
    {
      id: 4,
      title: "You",
      image: You,
      description:
        "Quando Joe Goldberg (Penn Badgley) conhece Guinevere Beck (Elizabeth Lail), tem certeza de que ela é o amor de sua vida. Mas o que poderia ser um lindo romance, acaba se transformando em uma obsessão perigosa.",
    },
  ]);
  
  const [movies, setMovies] = useState([
    // {
    //   id: 1,
    //   title: "Avatar: O Caminho da Água",
    //   image: Avatar,
    //   description:
    //   "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos.",
    // },
    // {
    //   id: 2,
    //   title: "jogador Numero 1",
    //   image: jogadorN1,
    //   description:
    //   "Wade Watts, prefere a realidade virtual do jogo OASIS ao mundo real. O criador do jogo, morre e deixa sua fortuna inestimável para a pessoa que descobrir a chave de um quebra-cabeça que ele arquitetou.",
    // },
  ]);
  
  const [music, setMusic] = useState([]);
  
  useEffect(() => {
    fetch(`${apiUrl}/musica`)
      .then((response) => response.json())
      .then((data) => setMusic(data));
  }, []);

  useEffect(() => {
    fetch(`${apiUrl}/filme`)
      .then((response) => response.json())
      .then((data) => setMovies(data));
  }, []);
  
  return (
    <Container className="mt-5">
      <Row>
        <Col>
          <Tabs defaultActiveKey="movies" id="media-tabs">
            <Tab eventKey="movies" title="Filmes">
              <Row>
                {movies.map((media) => (
                  <Col md={4} key={media.id}>
                    <Card className="m-3">
                      <Card.Img variant="top" src={img} />
                      <Card.Body>
                        <Card.Title>{media.titulo}</Card.Title>
                        <Card.Text>{media.genero}</Card.Text>
                        <Button variant="primary">Assistir</Button>
                      </Card.Body>
                    </Card>
                  </Col>
                ))}
              </Row>
            </Tab>
            <Tab eventKey="music" title="Músicas">
              <Row>
                {music.map((media) => (
                  <Col md={4} key={media.id}>
                    <Card className="m-3">
                      <Card.Img variant="top" src={img} />
                      <Card.Body>
                        <Card.Title>{media.titulo}</Card.Title>
                        <Card.Text>{media.musico.nome}</Card.Text>
                        <Button variant="primary">Ouvir</Button>
                      </Card.Body>
                    </Card>
                  </Col>
                ))}
              </Row>
            </Tab>
            <Tab eventKey="series" title="Séries">
              <Row>
                {series.map((media) => (
                  <Col md={4} key={media.id}>
                    <Card className="m-3">
                      <Card.Img variant="top" src={media.image} />
                      <Card.Body>
                        <Card.Title>{media.title}</Card.Title>
                        <Card.Text>{media.description}</Card.Text>
                        <Button variant="primary">Assistir</Button>
                      </Card.Body>
                    </Card>
                  </Col>
                ))}
              </Row>
            </Tab>
          </Tabs>
        </Col>
      </Row>
    </Container>
  );
}

