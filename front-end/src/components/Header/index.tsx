import { Link } from 'react-router-dom';
import styles from './styles.module.css';

function Header() {
    return (
      <div className={styles.containerBack}>
        <div className={styles.container}>
            <div className={styles.logo}>
              <Link to="/">
                <h2 className="text-primary">DordoxVendas</h2>
              </Link>
            </div>
            <div className={styles.hours}>
                <span>29 maio, 21</span>
            </div>
        </div>
      </div>
    );
  }
  
  export default Header;
  