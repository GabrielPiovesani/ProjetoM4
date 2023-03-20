import { Form, Row,Col, FormGroup, Label,Input, Button } from "reactstrap"
import React from "react"



export default function Formulario(){
    return(
        <Form className="p-5">
        <Row>
          <Col md={6}>
            <FormGroup>
              <Label for="exampleEmail" 
              className="text-white">
                E-mail
              </Label>
              <Input
                id="exampleEmail"
                name="email"
                placeholder="Digite seu E-mail"
                type="email"
              />
            </FormGroup>
          </Col>
          <Col md={6}>
            <FormGroup>
              <Label for="examplePassword" 
              className="text-white">
                Senha
              </Label>
              <Input
                id="examplePassword"
                name="password"
                placeholder="Digite sua senha"
                type="password"
              />
            </FormGroup>
          </Col>
        </Row>
        <FormGroup>
          <Label for="exampleAddress" 
          className="text-white">
            Endereço
          </Label>
          <Input
            id="exampleAddress"
            name="address"
            placeholder="Digite seu endereço"
          />
        </FormGroup>
        <FormGroup>
          <Label for="exampleAddress2"
           className="text-white">
            Telefone
          </Label>
          <Input
            id="exampleAddress2"
            name="address2"
            placeholder="Digite seu telefone"
          />
        </FormGroup>
        <Row>
          <Col md={6}>
            <FormGroup>
              <Label for="exampleCity" 
              className="text-white">
                Cidade
              </Label>
              <Input
                id="exampleCity"
                name="city"
              />
            </FormGroup>
          </Col>
          <Col md={4}>
            <FormGroup>
              <Label for="exampleState" 
              className="text-white">
                Estado
              </Label>
              <Input
                id="exampleState"
                name="state"
              />
            </FormGroup>
          </Col>
          <Col md={2}>
            <FormGroup>
              <Label for="exampleZip" 
              className="text-white">
                CEP
              </Label>
              <Input
                id="exampleZip"
                name="zip"
              />
            </FormGroup>
          </Col>
        </Row>
        <FormGroup check>
          <Input
            id="exampleCheck"
            name="check"
            type="checkbox"
          />
          <Label
            check
            for="exampleCheck"
            className="text-white"
          >
            Check me out
          </Label>
        </FormGroup>
        <Button>
          Sign in
        </Button>
      </Form>

    )
}


