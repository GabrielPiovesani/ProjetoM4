import { Card, Row, Col, Container } from 'react-bootstrap';
import Foto1 from "../../assets/img/Musica/PeNaAreia.jpg"

export default function Playlist() {
    return (
      <Container className="py-5">
        <Card className="bg-transparent text-white" style={{ border: 'none', margin: 0 }}>
          <Card.Body>
            <Card.Title style={{ fontSize: '40px' }}>Suas Playlist</Card.Title>
          </Card.Body>
        </Card>
  
        <Card className="bg-transparent text-white my-4 mx-5">
          <Row>
            <Col md={2}>
              <Card.Img src={Foto1} />
            </Col>
            <Col className="p-0" md={8}>
              <Card.Body>
                <Card.Title>Pagode</Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Col>
          </Row>
        </Card>
  
        <Card className="bg-transparent text-white my-4 mx-5">
          <Row>
            <Col md={2}>
              <Card.Img src={Foto1} />
            </Col>
            <Col className="p-0" md={8}>
              <Card.Body>
                <Card.Title>Pop</Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Col>
          </Row>
        </Card>
        <Card className="bg-transparent text-white my-4 mx-5">
          <Row>
            <Col md={2}>
              <Card.Img src={Foto1} />
            </Col>
            <Col className="p-0" md={8}>
              <Card.Body>
                <Card.Title>Rock</Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Col>
          </Row>
        </Card>
        <Card className="bg-transparent text-white my-4 mx-5">
          <Row>
            <Col md={2}>
              <Card.Img src={Foto1} />
            </Col>
            <Col className="p-0" md={8}>
              <Card.Body>
                <Card.Title>Funk</Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Col>
          </Row>
        </Card>
        </Container>
    );
}