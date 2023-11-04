import { useState } from "react";
import { Form, Button, Alert } from "react-bootstrap";
import axios from "axios";

function Formulario() {
  const [nome, setNome] = useState("");
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");
  const [confirmSenha, setConfirmSenha] = useState("");
  const [showFeedback, setShowFeedback] = useState(false);
  const [feedbackMsg, setFeedbackMsg] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (senha !== confirmSenha) {
      setShowFeedback(true);
      setFeedbackMsg("As senhas não coincidem.");
      return;
    }

    // Crie um objeto com os dados do usuário
    const userData = {
      nome: nome,
      email: email,
      senha: senha,
    };



    try {
      const response = await axios.post('http://localhost:8090/usuarios/criar', userData);

      if (response.status === 201) {
        setShowFeedback(true);
        setFeedbackMsg("Cadastro realizado com sucesso!");
      } else if (response.data) {
          setShowFeedback(true);
          setFeedbackMsg(response.data.mensagem); // Exibe a mensagem de erro do backend
        } else {
          setShowFeedback(true);
          setFeedbackMsg("Erro ao cadastrar o usuário.");
        }

    } catch (error) {
        if (error.response && error.response.data) {
          setShowFeedback(true);
          setFeedbackMsg(error.response.data.mensagem);
        } else {
          console.error(error);
          setShowFeedback(true);
          setFeedbackMsg("Erro ao fazer a solicitação.");
        }
      }


  }


  return (
      <div className="d-flex justify-content-center mt-0" >
        <Form className="formCadastro"  onSubmit={handleSubmit}>
          <h4>Criar Conta</h4>
          <div className="textcadastro" style={{ color: 'white' }}>
            <p>Crie a sua única conta para todos os produtos ValDisnei</p>
          </div>

          {showFeedback && (
              <Alert variant={feedbackMsg.includes("sucesso") ? "success" : "danger"} onClose={() => setShowFeedback(false)} dismissible>
                {feedbackMsg.includes("sucesso") ? "Sucesso: " : "Erro: "}{feedbackMsg}
              </Alert>
          )}

          <Form.Group controlId="nome">
            <Form.Label style={{ color: 'white' }}>Nome</Form.Label>
            <Form.Control type="text" placeholder="Digite seu nome" value={nome} onChange={(e) => setNome(e.target.value)} />
          </Form.Group>

          <Form.Group controlId="email">
            <Form.Label style={{ color: 'white' }}>Email</Form.Label>
            <Form.Control type="email" placeholder="Digite seu email" value={email} onChange={(e) => setEmail(e.target.value)} />
          </Form.Group>

          <Form.Group controlId="senha">
            <Form.Label style={{ color: 'white' }}>Senha</Form.Label>
            <Form.Control type="password" placeholder="Digite sua senha" value={senha} onChange={(e) => setSenha(e.target.value)} />
          </Form.Group>

          <Form.Group controlId="confirm-senha">
            <Form.Label style={{ color: 'white' }}>Confirmar senha</Form.Label>
            <Form.Control
                type="password"
                placeholder="Digite novamente sua senha"
                value={confirmSenha}
                onChange={(e) => setConfirmSenha(e.target.value)}
            />
          </Form.Group>
          <Button className="btnFormulario" variant="primary" type="submit">
            Cadastrar
          </Button>
        </Form>
      </div>
  );
}

export default Formulario;
