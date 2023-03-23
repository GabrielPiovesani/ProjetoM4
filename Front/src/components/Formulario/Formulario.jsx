import { useState } from "react";
import { Form, Button, Alert } from "react-bootstrap";


function Formulario() {
  const [nome, setNome] = useState("");
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");
  const [confirmSenha, setConfirmSenha] = useState("");
  const [showFeedback, setShowFeedback] = useState(false);
  const [feedbackMsg, setFeedbackMsg] = useState("");


  const [nomeErr, setNomeErr] = useState(false);
  const [emailErr, setEmailErr] = useState(false);
  const [senhaErr, setSenhaErr] = useState(false);
  const [confirmSenhaErr, setConfirmSenhaErr] = useState(false);
  const [showFeedbackErr, setShowFeedbackErr] = useState(true);
  const [feedbackMsgErr, setFeedbackMsgErr] = useState("");

  
  const handleSubmit = (e) => {
    e.preventDefault();

    // Verifica se as senhas são iguais
    if (senha !== confirmSenha) {
      setShowFeedback(true);
      setFeedbackMsg("As senhas não coincidem.");
      return;
    }
    
    
    console.log(`NomeErr:${""}, EmailErr:${""}, SenhaErr:${""}, ConfirmSenhaErr:{""}, ShowFeedbackErr:${""},FeedbackMsgErr:${""}`); 
      setShowFeedbackErr(false);
      setFeedbackMsgErr("Cadastro !");

    

    // Faz o cadastro do usuário
    console.log(`Nome: ${nome}, Email: ${email}, Senha: ${senha}, Confirmação de senha: ${confirmSenha}`);

    // Exibe uma mensagem de sucesso para o usuário
    setShowFeedback(true);
    setFeedbackMsg("Cadastro realizado com sucesso!");
  };




  return (
    <div className="d-flex justify-content-center" >
      <Form className="formCadastro" onSubmit={handleSubmit}>
        <h4>Criar Conta</h4>
        <div className="textcadastro">
        <p>Crie a sua única conta para todos os produtos ValDisnei</p></div>

        {showFeedback && (
          <Alert variant={feedbackMsg.includes("sucesso") ? "success" : "danger"} onClose={() => setShowFeedback(false)} dismissible>
            {feedbackMsg}
          </Alert>
        )}
        
        <Form.Group controlId="nome">
          <Form.Label>Nome</Form.Label>
          <Form.Control type="text" placeholder="Digite seu nome" value={nome} onChange={(e) => setNome(e.target.value)} />
        </Form.Group>

        <Form.Group controlId="email">
          <Form.Label>Email</Form.Label>
          <Form.Control type="email" placeholder="Digite seu email" value={email} onChange={(e) => setEmail(e.target.value)} />
        </Form.Group>

        <Form.Group controlId="senha">
          <Form.Label>Senha</Form.Label>
          <Form.Control type="password" placeholder="Digite sua senha" value={senha} onChange={(e) => setSenha(e.target.value)} />
        </Form.Group>

        <Form.Group controlId="confirm-senha">
          <Form.Label>Confirmar senha</Form.Label>
          <Form.Control
            type="password"
            placeholder="Digite novamente sua senha"
            value={confirmSenha}
            onChange={(e) => setConfirmSenha(e.target.value)}
          />
        </Form.Group>
        <Button className="btnFormulario"  variant="primary" type="submit">
          Cadastrar
        </Button>
      </Form>
    </div>
  );
}

export default Formulario;
