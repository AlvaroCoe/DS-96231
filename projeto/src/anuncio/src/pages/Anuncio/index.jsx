
import Header from '../../components/Header';
import Footer from '../../components/Footer';
import './style.css';

export default function Anuncio() {
return (
    <div className="page-container">
    <Header />
    
    <main className="main-content">
        <div className="anuncio-card">
        <div className="anuncio-image">
            {/* Você pode substituir por uma imagem real na sua pasta assets */}
            <div className="placeholder-img">Imagem do Produto</div>
        </div>
        
        <div className="anuncio-info">
            <span className="tag">Destaque</span>
            <h1>Notebook Gamer Ultra Pro 2026</h1>
            <p className="price">R$ 5.499,00</p>
            <p className="description">
            Leve sua experiência de jogo e trabalho para o próximo nível. Equipado com as últimas tecnologias do mercado, alta performance e resfriamento otimizado. Produto novo, na caixa e com garantia.
            </p>
            <button className="btn-buy">Comprar Agora</button>
        </div>
        </div>
    </main>

    <Footer />
    </div>
);
}