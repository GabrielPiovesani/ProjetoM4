import Formulario from '../../components/Formulario/Formulario.jsx'
import React from "react"
import Footer from '../../components/Footer/Footer.jsx'
import LoginMenu from '../../components/LoginMenu/LoginMenu.jsx';

export default function Cadastro(){
  return(
  <>
    <LoginMenu/>
    <Formulario></Formulario>
    <Footer/>
    </>
  )
}
