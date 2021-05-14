import Footer from "components/Footer";
import Header from "components/Header";
import { Link } from "react-router-dom";

function Home() {
    return (
      <>
        <Header />
        <div className="container">
          <div className="jumbotron bg-light mt-5 rounded" >
              <h1 className="display-3 fw-bold text-primary">Dordox Vendas</h1>
              <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
              <hr/>
              <p>Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
              <Link to="/DashBoard" className="btn btn-lg fw-bold btn-outline-secondary" >Acessar DashBoard</Link>
          </div>
        </div>
        <Footer />
      </>
    );
  }
  
  export default Home;
  