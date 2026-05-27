import './style.css'

export default function AdicionarUsuario() {
const [nome, setNome] = useState('');
const [email, setEmail] = useState('');
const [listaUsuarios, setListaUsuarios] = useState([]);

const adicionarNovoUsuario = (event) => {
  event.preventDefault();
  if (nome && email) {
    setListaUsuarios([...adicionarNovoUsuario, { nome, email }]);
    setNome('');
    setEmail('');
  }

  return (

    <h1>Adicionar usuário</h1>
  )
  
  }
}