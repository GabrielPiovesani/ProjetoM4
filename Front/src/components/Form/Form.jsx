import React, { useState } from 'react';
import style from '../LoginMenu/Login.module.css';
import {validaEmail} from './FormValidacao';
import { Link } from 'react-router-dom';


const Form = () => {


  const [emailErr, setEmailErr] = useState (false)
  const [email,setEmail] = useState ("")

  const FormValidacao = () =>{
    if(!validaEmail.test(email)){
      setEmailErr(true)
    }else{
      setEmailErr(false)
    }
  }
  
  return(
  

 <div className="d-flex justify-content-center">
      <form  className="containerLogin" >
    <div class = "form-group">
        <h2>Entrar</h2>
      <label for="exampleInputEmail1">Email</label>
      <input value={email} onChange={e => setEmail(e.target.value)}type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="email"></input>
      {emailErr && <p>Por favor, digite um email valido!</p>} 
    </div>
    <div class="form-group">
      <label>Senha</label>
      <input  type="password" class="form-control" id="exampleInputPassword1" placeholder="senha"></input>
    </div>
    <div className={style.buttonLogin}>
<button  type="submit" class="btn btn-info"onClick={FormValidacao}>
  Enviar </button>
<p>Não tem ValDisnei?  <Link to= "/cadastro">Assine</Link></p>
</div>
      </form>

     </div>
    
  );
}
export default Form; 