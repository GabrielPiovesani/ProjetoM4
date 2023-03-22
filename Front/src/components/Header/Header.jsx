import { Navbar, Nav, Button } from 'react-bootstrap';
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
      <Navbar style={{ backgroundColor: '#000000', boxShadow: '5 5px 10px rgba(0,0,0,0.5)' }} expand="lg">

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
        <Nav className="w-100 justify-content-center" >
          <Nav.Link  style={{ color: 'white', fontSize: '20px' }} href="/biblioteca">Biblioteca</Nav.Link>
          <Nav.Link  style={{ color: 'white', fontSize: '20px' }} href="/playlist">Minhas Playlists</Nav.Link>
        </Nav>
        <Navbar.Collapse id="basic-navbar-nav">
        
          {username && <p>{username}</p>}
        </Navbar.Collapse>
      </Navbar>
    </div>
  );
}