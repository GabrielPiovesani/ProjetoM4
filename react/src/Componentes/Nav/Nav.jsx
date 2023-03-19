import { Link } from "react-router-dom";

export default function Nav() {
  return (
    <nav className={styles.Nav}>
      <Link to={"/"}>Home</Link>
      <Link to={"/cadastro"}>Cadastro</Link>
      
      
    </nav>
  );
}
