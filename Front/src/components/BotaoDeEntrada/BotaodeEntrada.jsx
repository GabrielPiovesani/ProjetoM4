import { Nav, Navbar, Button } from 'react-bootstrap';

function BotaoEntrada() {
  return (
    <Navbar bg="transparent" expand="lg" style={{ width: '100%', margin: '0', paddingLeft: '1rem', paddingRight: '1rem' ,color: 'white'}}>
    <Navbar.Brand href="#"><h3>Valdisnei</h3></Navbar.Brand>
    <Navbar.Toggle aria-controls="basic-navbar-nav" />
    <Navbar.Collapse id="basic-navbar-nav">
      <Nav className="ms-auto">
        <Button variant="primary">Login</Button>
      </Nav>
    </Navbar.Collapse>
  </Navbar>
  );
}

export default BotaoEntrada;