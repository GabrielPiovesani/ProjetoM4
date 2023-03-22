import React from "react";
import { Card, Container } from "react-bootstrap";
import computador from "../../assets/img/notbook.png";
import celular from "../../assets/img/celulartable.png";
import tablet from "../../assets/img/videogame.png";
import tv from "../../assets/img/tv.png";

function Dispositivo() {
  return (
    <Container>
    <div className="m-5">
      <h3 className="text-center mb-4">Assista em seus dispositivos favoritos</h3>
      <div className="d-flex justify-content-center">
        <div className="row">
          <div className="col-md-3 text-center">
            <img src={tablet} alt="Imagem 2" className="img-fluid mb-3" />
            <h5>Videogames</h5>
          </div>
          <div className="col-md-3 text-center"style={{ marginBottom: '55x' }}>
            <img src={celular} alt="Imagem 1" className="img-fluid mb-3" />
            <h5>smartphones</h5>
          </div>
          <div className="col-md-3 text-center">
            <img src={computador} alt="Imagem 3" className="img-fluid mb-3" />
            <h5>Computadores</h5>
          </div>
          <div className="col-md-3 text-center">
            <img src={tv} alt="Imagem 4" className="img-fluid mb-3" />
            <h5>Televisores</h5>
          </div>
        </div>
      </div>
      </div>
      </Container>
  );
}

export default Dispositivo;
