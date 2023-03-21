import { useState } from "react";
import { Form, Button, Alert } from "react-bootstrap";


function Formulario() {
  const [nome, setNome] = useState("");
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");
  const [confirmSenha, setConfirmSenha] = useState("");
  const [showFeedback, setShowFeedback] = useState(false);
  const [feedbackMsg, setFeedbackMsg] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    // Verifica se as senhas são iguais
    if (senha !== confirmSenha) {
      setShowFeedback(true);
      setFeedbackMsg("As senhas não coincidem.");
      return;
    }

    // Faz o cadastro do usuário
    console.log(`Nome: ${nome}, Email: ${email}, Senha: ${senha}, Confirmação de senha: ${confirmSenha}`);

    // Exibe uma mensagem de sucesso para o usuário
    setShowFeedback(true);
    setFeedbackMsg("Cadastro realizado com sucesso!");
  };

  return (
    <div className="d-flex justify-content-center mt-5" >
      <Form onSubmit={handleSubmit}>
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

        <Button variant="primary" type="submit">
          Cadastrar
        </Button>
      </Form>
    </div>
  );
}

export default Formulario;
