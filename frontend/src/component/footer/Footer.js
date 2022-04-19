import {Component} from "react";
import {Contacts} from "../contacts/Contacts";
import {Copyright} from "../copyright/Copyright";

import "./Footer.css";

export class Footer extends Component {

    render() {
        return (
            <footer className="footer">
                <Copyright/>
                <Contacts/>
            </footer>
        )
    }

}