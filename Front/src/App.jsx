import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Catalogo from './pages/Catalogo/Catalogo.jsx';
import Inicio from './pages/Inicio/Inicio.jsx'
import Login from './pages/Login/Login.jsx';
import Cadastro from './pages/Cadastro/Cadastro.jsx';
import PlaylistsPage from './pages/MinhasPlaylist/MinhaPLaylist.jsx';


function App() {

  return (
    <div className="App">
      <Router>
      <Routes>
      <Route path='/' element={<Inicio/>} />
      <Route path="/home" element={<Catalogo />} />
      <Route path="/login" element={<Login />}/>
      <Route path="/biblioteca" element={<Catalogo/>} />
          <Route path="/playlist" element={<PlaylistsPage />} />
          <Route path="/cadastro" element={<Cadastro/>}/>
      </Routes>
        </Router> 
    </div>
  )
}

export default App
