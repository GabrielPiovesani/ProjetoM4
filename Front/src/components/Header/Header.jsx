import { Navbar, Nav, Button, Form } from 'react-bootstrap';
import logo from '../../assets/img/Logo.png';
import React, { useState } from 'react';


export default function Header() {
  const [username, setUsername] = useState('');
 
  function handleLogin(username) {
    // Aqui você faria a lógica de autenticação e definiria o nome de usuário na variável de estado
    setUsername(username);
   
  }

  return (
    <div>
      <Navbar className='d-flex r w-100' style={{ backgroundColor: '#000000', boxShadow: '5 5px 10px rgba(0,0,0,0.5)' }} expand="lg" >

        <Navbar.Brand>
          <img
            src={logo}
            width="100"
            height="40"
            className="d-inline-block align-top"
            alt="Logo"
          />
        </Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" /> 
         <Nav className="justify-content-center mx-auto" >
          <Nav.Link  style={{ color: 'white', fontSize: '20px' }} href="/home">Biblioteca</Nav.Link>
          <Nav.Link  style={{ color: 'white', fontSize: '20px' }} href="/mediaplayer">Minhas Playlists</Nav.Link>
        </Nav> 
        <Navbar.Collapse id="basic-navbar-nav">
          {username && <p>{username}</p>}
        </Navbar.Collapse>
      </Navbar>



    </div>
  );
}