import React from 'react';
import { Container, Row, Col, Card, Button, ListGroup } from 'react-bootstrap';
import Header from "../../components/Header/Header.jsx";
import MediaCatalogo from "../../components/MediaCatalogo/MediaCatalogo.jsx";
import Carrossel from "../../components/Carrossel/Carrosel.jsx"
import Footer from '../../components/Footer/Footer.jsx';
export default function Catalogo(){
  return (
    <>
    <Header/>
      <Container>
        <Carrossel></Carrossel>
        <MediaCatalogo/>
      </Container>
      <Footer/>
    </>
  );
};

