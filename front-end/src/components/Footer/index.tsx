import styles from './styles.module.css';

function Footer() {
    return (
        <div className={styles.container}>
            <span className={styles.spanFooter}>App desenvolvido por <strong><a href="#">Henrique R Dullius</a></strong></span>
            <span className={styles.spanFooter}>© 2021 Copyright <strong>DordoxVendas</strong></span>
        </div>
    );
  }
  
  export default Footer;
  