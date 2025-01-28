import './estilo.css'
import logo from '../../image/logo.svg'
function Logo(){

    return (
        <div className='logo'>
            <img src={logo} alt='Logo do site' className='logo-img'></img>
            <p><strong>Alura</strong>Books</p>
        </div>

    )

}

export default Logo;