import React from 'react';
import { Container, Row, Col, Card, ListGroup, ListGroupItem } from 'react-bootstrap';


  const medias = [
    { title: 'Filme 1', type: 'Filme', image: 'https://via.placeholder.com/150' },
    { title: 'Série 1', type: 'Série', image: 'https://via.placeholder.com/150' },
    { title: 'Álbum 1', type: 'Álbum', image: 'https://via.placeholder.com/150' },
    { title: 'Filme 2', type: 'Filme', image: 'https://via.placeholder.com/150' },
    { title: 'Série 2', type: 'Série', image: 'https://via.placeholder.com/150' },
    { title: 'Álbum 2', type: 'Álbum', image: 'https://via.placeholder.com/150' },
  ];
  
  const MediaCatalog = () => {
    return (
      <Container fluid>
        <Row>
          <Col>
            <Card className="m-3">
              <Card.Header>Playlist 1</Card.Header>
              <ListGroup variant="flush">
                <ListGroupItem>Song 1</ListGroupItem>
                <ListGroupItem>Song 2</ListGroupItem>
                <ListGroupItem>Song 3</ListGroupItem>
              </ListGroup>
            </Card>
          </Col>
          <Col>
            <Card className='m-3'>
              <Card.Header>Playlist 2</Card.Header>
              <ListGroup variant="flush">
                <ListGroupItem>Song 4</ListGroupItem>
                <ListGroupItem>Song 5</ListGroupItem>
                <ListGroupItem>Song 6</ListGroupItem>
              </ListGroup>
            </Card>
          </Col>
        </Row>
        <Row>
          <Col>
            <Card className='m-2'>
              <Card.Header>Galeria de Mídias</Card.Header>
              <Card.Body>
                <Row>
                  {medias.map((media, index) => (
                    <Col xs={12} sm={6} md={4} lg={3} key={index}>
                      <Card className='m-3'>
                        <Card.Img variant="top" src={media.image} />
                        <Card.Body>
                          <Card.Title>{media.title}</Card.Title>
                          <Card.Text>{media.type}</Card.Text>
                        </Card.Body>
                      </Card>
                    </Col>
                  ))}
                </Row>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>
    );
  };  

export default MediaCatalog;

