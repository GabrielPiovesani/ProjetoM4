import React from "react";
import { Card, Button } from "react-bootstrap";

function Tabela() {
    return (
      
        <div className="d-flex justify-content-center m-4">
        
        <div className="col-md-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">
              <Card.Title className="display-6">Básico</Card.Title>
              <Card.Subtitle className="mb-2 text-muted">R$ 19.90/mês</Card.Subtitle>
              <Card.Text>
                Este é o plano básico, com recursos limitados, ideal para quem está começando.
              </Card.Text>
              <Button variant="primary">Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        <div className="col-md-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">
              <Card.Title className="display-6"> Intermediário</Card.Title>
              <Card.Subtitle className="mb-2 text-muted">R$ 29.90/mês</Card.Subtitle>
              <Card.Text>
                Este é o plano intermediário, com mais recursos, perfeito para empresas em crescimento.
              </Card.Text>
              <Button variant="primary">Assinar</Button>
            </Card.Body>
          </Card>
        </div>
        <div className="col-md-3">
          <Card style={{ width: "18rem" }}>
            <Card.Body className="text-center my-4">
              <Card.Title className="display-6"> Premium</Card.Title>
              <Card.Subtitle className="mb-2 text-muted">R$ 49.90/mês</Card.Subtitle>
              <Card.Text>
                Este é o plano premium, com todos os recursos disponíveis, para empresas que precisam do melhor.
              </Card.Text>
              <Button variant="primary">Assinar</Button>
            </Card.Body>
          </Card>
        </div>
      </div>
  
  );
}

export default Tabela;