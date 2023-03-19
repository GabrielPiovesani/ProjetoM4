import React from 'react';
import { Container } from 'react-bootstrap';
import Header from '../../components/Header/Header.jsx';
import CarroselPage from '../../components/Carrossel/Carrosel.jsx'

export default function Home() {
    return (
        <>
            <Header></Header>
            <Container >
            <CarroselPage />
            </Container>
        </>
    )



}

