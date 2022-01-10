import React from "react";
import './Contacts.css';

class Contacts extends React.Component {
    render() {
        return (
            <ul className="contacts">
                <li className="contacts__item">
                    <a className="phone" href="tel:+7000123456789">+7 000 123456789</a>
                </li>
                <li className="contacts__item">
                    <a className="email" href="mailto:my@email.com">my@email.com</a>
                </li>
                <li className="contacts__item">
                    <div className="address">Lorem ipsum dolor sit amet.</div>
                </li>
            </ul>
        );
    }
}

export default Contacts;