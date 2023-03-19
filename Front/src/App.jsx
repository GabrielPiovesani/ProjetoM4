import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Catalogo from './pages/Catalogo/Catalogo.jsx';
import Home from './pages/Home/Home.jsx';
import Inicio from './pages/Inicio/Inicio.jsx'
import Login from './pages/Login/Login.jsx';



function App() {

  return (
    <div className="App">
      <Router>
      <Routes>
      <Route path='/' element={<Inicio/>} />
      <Route path="/home" element={<Home />} />
      <Route path="/catalogo" element={<Catalogo/>}/>
      <Route path="/login" element={<Login/>}/>
      <Route />
      </Routes>
        </Router> 
    </div>
  )
}

export default App
