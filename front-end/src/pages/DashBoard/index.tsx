import Header from 'components/Header';
import Footer from 'components/Footer';
import DataTable from 'components/DataTable';
import BarChart from 'components/BarChart';
import DonutChart from 'components/DonutChart';

function DashBoard() {
    return (
      <>
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
      </>
    );
  }
  
  export default DashBoard;