import React from 'react';
import { Container, Row, Col, Card, Button, ListGroup } from 'react-bootstrap';
import Header from "../../components/Header/Header.jsx";
import MediaCatalog from '../../components/MediaCatalogo/MediaCatalogo.jsx';

export default function Catalogo(){
  return (
    <>
    <Header/>
    <Container>
    <MediaCatalog/>
    </Container>
    </>
  );
};

