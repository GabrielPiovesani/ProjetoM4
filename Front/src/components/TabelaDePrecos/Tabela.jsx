import React from "react";
import { Card, Button, Container } from "react-bootstrap";


function Tabela() {
    return (
        <Container>
        <div className="d-flex justify-content-center m-4">
        <div className="m-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">
              <Card.Title className="display-6">Básico</Card.Title>
              <Card.Subtitle className="mb-2 text-dark">R$ 19.90/mês</Card.Subtitle>
              <Card.Text className="text-dark">
                Plano básico, com recursos limitados, ideal para quem está começando.
              </Card.Text>
              <Button variant="primary" href="/cadastro" >Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        <div className="m-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">
              <Card.Title className="display-6"> Intermediário</Card.Title>
              <Card.Subtitle className="mb-2 text-dark">R$ 29.90/mês</Card.Subtitle>
              <Card.Text className="text-dark">
                Plano mensal, com mais recursos, perfeito para quem gosta de aproveitar o momento.
              </Card.Text>
              <Button variant="primary" href="/cadastro" >Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        <div className="m-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">
              <Card.Title className="display-6"> Premium</Card.Title>
              <Card.Subtitle className="mb-2 text-dark">R$ 49.90/mês</Card.Subtitle>
              <Card.Text className="text-dark">
                Plano premium, com todos os recursos disponíveis, onde e quando quiser.
              </Card.Text>
              <Button variant="primary" href="/cadastro">Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        </div>
        </Container>
        
        
  
  );
}

export default Tabela;