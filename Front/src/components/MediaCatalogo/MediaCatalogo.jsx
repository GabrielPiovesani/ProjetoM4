import React, { useState } from "react";
import { Container, Row, Col, Tabs, Tab, Card, Button } from 'react-bootstrap';
import Breakin from "../../assets/img/Serie/breakingbad.jpg"
import StrangerThings from "../../assets/img/Serie/StrangerThings.jpg"
import Reacher from "../../assets/img/Serie/Reacher.jpg"
import You from "../../assets/img/Serie/You.jpg"
import Avatar from "../../assets/img/Serie/Avatar.jpg"
import jogadorN1 from "../../assets/img/Serie/jogadorN1.jpg"
import PeNaAreia from "../../assets/img/Musica/PeNaAreia.jpg"
import Quando from "../../assets/img/Musica/Quando.jpg"

export default function MediaCatalogo() {
  // Defina o estado inicial dos dados da galeria de mídias
  const [series, setSeries] = useState([
    {
      id: 1,
      title: "Breaking Bad",
      image: Breakin,
      description:
        "Ao saber que tem câncer, um professor passa a fabricar metanfetamina pelo futuro da família, mudando o destino de todos.",
    },
    {
      id: 2,
      title: "Stranger Things",
      image: StrangerThings,
      description:
        "Quando um garoto desaparece, a cidade toda participa nas buscas. Mas o que encontram são segredos, forças sobrenaturais e uma menina.",
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
    {
      id: 1,
      title: "Avatar: O Caminho da Água",
      image: Avatar,
      description:
        "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos.",
    },
    {
      id: 2,
      title: "jogador Numero 1",
      image: jogadorN1,
      description:
        "Wade Watts, prefere a realidade virtual do jogo OASIS ao mundo real. O criador do jogo, morre e deixa sua fortuna inestimável para a pessoa que descobrir a chave de um quebra-cabeça que ele arquitetou.",
    },
  ]);

  const [music, setMusic] = useState([
    {
      id: 1,
      title: "Pé Na Areia",
      artist: "Diogo Nogueira",
      image: PeNaAreia,
    },
    {
      id: 2,
      title: "Quando Apaga A Luz",
      artist: "Gustavo Mioto e MC Don Juan",
      image: Quando,
    },
  ]);
  

  return (
    <Container className="mt-5 ">
      <Row>
        <Col>
          <Tabs defaultActiveKey="series" id="media-tabs">
            <Tab eventKey="series" title="Séries">
              <Row>
                {series.map((media) => (
                  <Col md={4} key={media.id}>
                    <Card className="m-3" >
                      <Card.Img variant="top" src={media.image} />
                      <Card.Body>
                        <Card.Title>{media.title}</Card.Title>
                        <Card.Text className="text-dark">{media.description}</Card.Text>
                        <Button variant="primary">Assistir</Button>
                      </Card.Body>
                    </Card>
                  </Col>
                ))}
              </Row>
            </Tab>
            <Tab eventKey="movies" title="Filmes">
              <Row>
                {movies.map((media) => (
                  <Col md={4} key={media.id}>
                    <Card className="m-3">
                      <Card.Img variant="top" src={media.image} />
                      <Card.Body>
                        <Card.Title>{media.title}</Card.Title>
                        <Card.Text className="text-dark">{media.description}</Card.Text>
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
                      <Card.Img variant="top" src={media.image} />
                      <Card.Body>
                        <Card.Title>{media.title}</Card.Title>
                        <Card.Text className="text-dark">{media.artist}</Card.Text>
                        <Button variant="primary">Ouvir</Button>
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

