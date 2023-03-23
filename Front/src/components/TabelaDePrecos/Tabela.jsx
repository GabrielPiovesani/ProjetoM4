import React from "react";
import { Card, Button, Container } from "react-bootstrap";


function Tabela() {
    return (
        <Container>
        <div className="d-flex justify-content-center m-4">
        <div className="m-3">
          <Card className="cardPlanos" style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">

              <Card.Title className="display-7">PLANO TRIMESTRAL</Card.Title>
              <Card.Subtitle className="mb-2 text-muted">R$ 54,00/mês</Card.Subtitle>
              <Card.Text>
              Assista séries, filmes e ouça suas músicas favoritas, onde e quando quiser.

              </Card.Text>
              <Button classname="btnTabela" variant="primary" href="/cadastro" >Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        <div className="m-3">
          <Card style={{ width: "18rem"}}>
            <Card.Body className="text-center my-4">

              <Card.Title className="display-7">PLANO ANUAL</Card.Title>
              <Card.Subtitle className="mb-2 text-muted">R$ 192,00/mês</Card.Subtitle>
              <Card.Text>
              Assista séries, filmes e ouça suas músicas favoritas, onde e quando quiser.

              </Card.Text>
              <Button classname="btnTabela" variant="primary" href="/cadastro" >Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        <div className="m-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">

              <Card.Title className="display-7">PLANO MENSAL</Card.Title>
              <Card.Subtitle className="mb-2 text-muted">R$ 20,00/mês</Card.Subtitle>
              <Card.Text>
              Assista séries, filmes e ouça suas músicas favoritas, onde e quando quiser.

              </Card.Text>
              <Button classname="btnTabela" variant="primary" href="/cadastro">Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        </div>
        </Container>
        
        
  
  );
}

export default Tabela;