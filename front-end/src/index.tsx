import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';
import 'assets/css/style.css';
import App from './App';
import Header from './components/Header';
import Footer from './components/Footer';
import DataTable from 'components/DataTable';
import BarChart from 'components/BarChart';
import DonutChart from 'components/DonutChart';

ReactDOM.render(
  <React.StrictMode>
      <Header />
      <div className="container">
        <h1 className="text-primary my-4">Painel de Controle</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <BarChart />
          </div>
          <div className="col-sm-6">
           <DonutChart />
          </div>
        </div>
        <h1 className="text-primary my-4">Todas Vendas</h1>
        <DataTable />
      </div>
      <Footer />
  </React.StrictMode>,
  document.getElementById('root')
);
