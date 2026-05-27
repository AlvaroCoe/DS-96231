import './style.css'

export default function Footer() {
    return (
        <footer className='footer'>
            <p>
                &copy; {new Date().getFullYear()} DS-96231 - Professor Carlos Anderson
                <br />
                SENAI - Bahia - Salvador
            </p>
        </footer>
    
        )

    }