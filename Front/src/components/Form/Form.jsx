import React from 'react';
import style from '../LoginMenu/Login.module.css';

const Form = () => {
  
  return(
  
 <div className="d-flex justify-content-center align-items-center">
      <form className="containerLogin">
    <div class = "form-group">
        <h2>Entrar</h2>
      <label for="exampleInputEmail1">Email</label>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="email"></input>
    </div>
    <div class="form-group">
      <label>Senha</label>
      <input type="password" class="form-control" id="exampleInputPassword1" placeholder="senha"></input>
    </div>
    <div className={style.buttonLogin}>
<button  type="submit" class="btn btn-info">Enviar</button>
<p>Não tem ValDisnei? Assine</p>
</div>
      </form>

     </div>
    
  );
}
export default Form; 