/*import './style.css';
import logo from '../../assets/logo.WEBP';

//CONTEÚDO PRINCIPAL DA PÁGINA DE CLIENTES

export default function Clientes() {
     return (
        <>
           <img src={logo} alt="logo" className="logo-clientes" />
            
            <div className='clientes'>
            <p >
                Esse sistema de reciclagem tem como objetivo facilitar a conexão entre pessoas que possuem materiais recicláveis e empresas ou indivíduos interessados em adquirir esses materiais para reciclagem. Através do sistema, os usuários podem cadastrar os materiais recicláveis que possuem, como papel, plástico, vidro, metal, entre outros, e disponibilizá-los para venda ou troca. O sistema também pode incluir funcionalidades de geolocalização para facilitar a busca por materiais próximos aos usuários. Dessa forma, o sistema de reciclagem promove a sustentabilidade e a economia circular, incentivando a reutilização de materiais e contribuindo para a redução do impacto ambiental.
            </p>
            <h2>Cadastrar Produtos</h2>
            <p >
                
            </p>

        </div>
        </>
        
     )
    
} */


import { useState } from 'react';
import './style.css';
import logo from '../../assets/logo.WEBP'; // Mantendo o seu logo

export default function Clientes() {
  // Estados para controlar o formulário e o produto cadastrado
  const [nomeProduto, setNomeProduto] = useState('');
  const [categoria, setCategoria] = useState('');
  const [produtoCadastrado, setProdutoCadastrado] = useState(null);

  // Função que define a cor e a instrução com base na categoria
  const obterDefinicaoLixeira = (cat) => {
    switch (cat) {
      case 'papel':
        return { cor: 'azul', nome: 'Azul (Papel)', icon: '📝', instrucao: 'Dobre as caixas e evite amassar folhas. Não recicle papel sujo ou engordurado.' };
      case 'plastico':
        return { cor: 'vermelha', nome: 'Vermelha (Plástico)', icon: '🥤', instrucao: 'Lave bem a embalagem para remover restos de alimentos antes de descartar.' };
      case 'metal':
        return { cor: 'amarela', nome: 'Amarela (Metal)', icon: '🥫', instrucao: 'Amasse as latas de alumínio para ocupar menos espaço. Retire lacres se possível.' };
      case 'vidro':
        return { cor: 'verde', nome: 'Verde (Vidro)', icon: '🍾', instrucao: 'Lave e remova as tampas. Se estiver quebrado, embale em jornal para proteger o coletor.' };
      case 'organico':
        return { cor: 'marrom', nome: 'Marrom (Orgânico)', icon: '🍎', instrucao: 'Restos de alimentos e cascas. Ideal para compostagem mecânica ou caseira.' };
      default:
        return { cor: 'cinza', nome: 'Cinza (Não Reciclável)', icon: '🗑️', instrucao: 'Resíduos gerais que não podem ser reciclados (como fitas adesivas ou espelhos).' };
    }
  };

  const lidarComCadastro = (e) => {
    e.preventDefault();
    if (!nomeProduto || !categoria) return alert('Por favor, preencha todos os campos!');

    // Salva o produto atual e busca as regras da lixeira dele
    const infosLixeira = obterDefinicaoLixeira(categoria);
    setProdutoCadastrado({
      nome: nomeProduto,
      ...infosLixeira
    });

    // Limpa o campo de texto do nome
    setNomeProduto('');
  };

  return (
    <div className="clientes">
      <img src={logo} alt="logo" className="logo-clientes" />
      
      <h2>Cadastrar Produtos para Reciclagem</h2>
      
      {/* Formulário de Cadastro */}
      <form onSubmit={lidarComCadastro} className="formulario-reciclagem">
        <div className="campo">
          <label>Nome do Produto:</label>
          <input
            type="text"
            placeholder="Ex: Garrafa PET, Caixa de Sapato..."
            value={nomeProduto}
            onChange={(e) => setNomeProduto(e.target.value)}
          />
        </div>

        <div className="campo">
          <label>Material / Categoria:</label>
          <select value={categoria} onChange={(e) => setCategoria(e.target.value)}>
            <option value="">Selecione o tipo de material</option>
            <option value="papel">Papel / Papelão</option>
            <option value="plastico">Plástico</option>
            <option value="metal">Metal</option>
            <option value="vidro">Vidro</option>
            <option value="organico">Orgânico</option>
            <option value="outro">Outros / Não Reciclável</option>
          </select>
        </div>

        <button type="submit">Cadastrar Produto</button>
      </form>

      {/* Card de Resultado que aparece após cadastrar */}
      {produtoCadastrado && (
        <div className="card-resultado animate-fade-in">
          <h3>🎉 Produto Cadastrado!</h3>
          <p>O produto <strong>{produtoCadastrado.nome}</strong> deve ser descartado na:</p>
          
          {/* Lixeira dinâmica baseada na cor */}
          <div className={`lixeira-display ${produtoCadastrado.cor}`}>
            <span className="lixeira-icone">{produtoCadastrado.icon}</span>
            <h4>Lixeira {produtoCadastrado.nome}</h4>
          </div>

          <div className="instrucao-box">
            <strong>Como descartar:</strong>
            <p>{produtoCadastrado.instrucao}</p>
          </div>
        </div>
      )}
    </div>
  );
}