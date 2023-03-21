import React from 'react';
import { Navbar, Nav, Button } from 'react-bootstrap';
import logo from '../../assets/img/Logo.png';

function BotaoEntrada() {
  return (
    <Navbar style={{ backgroundColor: '#000000', boxShadow: '5 5px 10px rgba(0,0,0,0.5)' }} expand="lg">
      <Navbar.Brand>
        <img
          src={logo}
          width="130"
          height="40"
          className="d-inline-block align-top"
          alt="Logo"
        />
        </Navbar.Brand>
      <Navbar.Toggle aria-controls="basic-navbar-nav" />
      <Navbar.Collapse id="basic-navbar-nav">
        <Nav className="ms-auto ">
          <Button variant="primary"
            style={{ marginRight: '50px' }}
            className="ml-auto" href="/login" >
            Login</Button>
        </Nav>
      </Navbar.Collapse>
    </Navbar>
  );
}

export default BotaoEntrada;