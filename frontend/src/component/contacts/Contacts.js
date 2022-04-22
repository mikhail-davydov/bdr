import {Component} from "react";
import {emailIcon, phoneIcon, telegramIcon, vkIcon} from "./ContactIcons";

import "./Contacts.css";

export class Contacts extends Component {

    constructor(props) {
        super(props);
        this.state = {
            contacts: [
                {
                    key: 1,
                    content: phoneIcon
                },
                {
                    key: 2,
                    content: emailIcon
                },
                {
                    key: 3,
                    content: telegramIcon
                },
                {
                    key: 4,
                    content: vkIcon
                },
            ]
        }
    }

    render() {
        let contacts = this.state.contacts.map(contact => {
            return (
                <a className="contacts__link" href="#" key={contact.key}>
                    <li className="contacts__item">
                        <div className="contacts__item-round icon">
                            {contact.content}
                        </div>
                    </li>
                </a>
            )
        });
        return (
            <div className="contacts-container">
                <ul className="contacts__list">
                    {contacts}
                </ul>
            </div>
        )
    }

}