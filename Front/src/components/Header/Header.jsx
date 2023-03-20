import { Container, Nav, Navbar } from 'react-bootstrap';



function Header() {
    return (
     <>
        <Navbar bg="dark" variant="dark" >
        <Container width="100%">
          <Navbar.Brand to="/home">ValDisnei</Navbar.Brand>
          <Nav className="me-auto">
              <Nav.Link href='/home'>Home</Nav.Link>
              <Nav.Link href="/catalogo">Catalogo</Nav.Link>
            <Nav.Link href="#features">Minhas Playlists</Nav.Link>
            <Nav.Link href='/cadastro'>Cadastro</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
    </>
      
    );
  }
  
  export default Header;