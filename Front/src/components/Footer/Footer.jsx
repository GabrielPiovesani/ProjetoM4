import { Container } from 'react-bootstrap';

function Footer() {
  return (
    <div className="wrapper">
    <div className="push"></div>
    <footer className="bg-transparent text-white py-3">
      <Container className="wrapper">
        <p className="text-center text-white">
        © Valdisnei - Todos os direitos reservados.
        </p>
      </Container>
    </footer>
  </div>
  );
}

export default Footer;