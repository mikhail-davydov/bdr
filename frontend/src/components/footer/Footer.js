import React from "react";
import './Footer.css';
import Contacts from "../contacts/Contacts";
import Copyright from "../copyright/Copyright";

class Footer extends React.Component {
    render() {
        return (
            <footer className="footer">
                <Copyright/>
                <Contacts/>
            </footer>
        );
    }
}

export default Footer;