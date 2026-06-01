
import './style.css';

export default function Header() {
  return (
    <header className="header">
      <div className="logo">ClassiVite</div>
      <nav className="nav">
        <a href="#home">Início</a>
        <a href="#detalhes">Detalhes</a>
        <a href="#contato">Contato</a>
      </nav>
      <button className="btn-header">Anunciar</button>
    </header>
  );
}