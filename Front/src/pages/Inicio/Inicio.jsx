import React from 'react';
import { Container } from 'react-bootstrap';
import CarroselPage from '../../components/Carrossel/Carrosel';
import Header from '../../components/Header/Header';
import Inicial from '../../components/PIncial/Inicial';
import Assinatura from '../../components/Assinatura/Assinatura'

export default function Home() {
    return (
        <>
            <Container className="d-flex flex-column ">
            <Inicial />
                <CarroselPage></CarroselPage>
                <Assinatura></Assinatura>

            </Container>
        </>
    )



}