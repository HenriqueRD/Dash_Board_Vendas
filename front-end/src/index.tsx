import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';
import 'assets/css/style.css';
import App from './App';
import Header from './components/Header';
import Footer from './components/Footer';
import DataTable from 'components/DataTable';

ReactDOM.render(
  <React.StrictMode>
      <Header />
      <div className="container">
        <DataTable />
      </div>
      <Footer />
  </React.StrictMode>,
  document.getElementById('root')
);
