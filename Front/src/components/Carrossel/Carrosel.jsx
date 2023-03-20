
import Img1 from '../../assets/img/Serie/Avatar.jpg'
import Img2 from '../../assets/img/Serie/Vingadores.jpg'
import Img3 from '../../assets/img/Serie/gatoDeBotas1.png'

import React, { useState } from 'react';
import Carousel from 'react-bootstrap/Carousel';

function CarroselPage() {
  const [index, setIndex] = useState(0);

  const handleSelect = (selectedIndex, e) => {
    setIndex(selectedIndex);
  };

  return (
    <div>
    <Carousel className='mt-3' activeIndex={index} onSelect={handleSelect}>

      <Carousel.Item>
        <img className="d-block w-100" src={Img1}alt="First slide"/>
      </Carousel.Item>
      <Carousel.Item>
        <img className="d-block w-100" src={Img2} alt="Second slide"/>
      </Carousel.Item>
      <Carousel.Item>
        <img className="d-block w-100" src={Img3} alt="Third slide"/>
      </Carousel.Item>
      </Carousel>
     
  );
}

export default CarroselPage