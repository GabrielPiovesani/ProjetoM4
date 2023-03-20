import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Catalogo from './pages/Catalogo/Catalogo.jsx';
import Home from './pages/Home/Home.jsx';
import Inicio from './pages/Inicio/Inicio.jsx'
import Cadastro from './pages/Cadastro/Cadastro.jsx'



function App() {

  return (
    <div className="App">
      <Router>
      <Routes>
      <Route path='/' element={<Inicio/>} />
      <Route path="/home" element={<Catalogo />} />
      <Route path=""/>
      <Route path="/cadastro" element={<Cadastro/>} />
      </Routes>
        </Router> 
    </div>
  )
}

export default App
