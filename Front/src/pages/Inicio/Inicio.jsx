import React from 'react';
import { Container } from 'react-bootstrap';
import CarroselPage from '../../components/Carrossel/Carrosel';
import Inicial from '../../components/PIncial/Inicial';
import Footer from '../../components/Footer/Footer';
import BotaoEntrada from '../../components/BotaoDeEntrada/BotaodeEntrada';
import Tabela from '../../components/TabelaDePrecos/Tabela'
import Dispositivo from '../../components/Dispositivo/Dispositivo';




export default function Home() {
    return (
        <>
           
           <BotaoEntrada/>
           <Container>
            <Inicial />
            <CarroselPage />
            </Container>
            <Dispositivo/>
            <Tabela />
            <Footer/>
            
        </>
    )



}