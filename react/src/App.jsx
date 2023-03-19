
import React from 'react'
import './App.css'
import Home from './Pages/Home/Home.jsx'
import Cadastro from './Pages/Cadastro/Cadastro.jsx'
import Form from './Pages/Cadastro/Cadastro.jsx'

import Footer from './Componentes/Footer/Footer.jsx'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
  

  return (
    <div className="App">
    <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/cadastro" element={<Cadastro />} />
          
        </Routes>
      </Router>
     <Footer/>
     <Form></Form>
     <Cadastro></Cadastro>
      
    </div>
  )
}

export default App
