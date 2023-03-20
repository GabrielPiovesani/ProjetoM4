import React from 'react';
import { Container } from 'react-bootstrap';
import CarroselPage from '../../components/Carrossel/Carrosel';
import Inicial from '../../components/PIncial/Inicial';

import BotaoEntrada from '../../components/BotaoDeEntrada/BotaodeEntrada';
import Tabela from '../../components/TabelaDePrecos/Tabela'
import Dispositivo from '../../components/Dispositivo/Dispositivo';


export default function Home() {
    return (
        <>
           
           <BotaoEntrada/>
            <Inicial />
            <CarroselPage/>
            <Dispositivo/>
            <Tabela/>
            

             

            
        </>
    )



}