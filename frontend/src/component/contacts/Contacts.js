import {Component} from "react";
import {email, phone, telegram, vk} from "../common/Constants";

import "./Contacts.css";

export class Contacts extends Component {

    constructor(props) {
        super(props);
        this.state = {
            contacts: [
                {
                    key: 1,
                    content: phone
                },
                {
                    key: 2,
                    content: email
                },
                {
                    key: 3,
                    content: telegram
                },
                {
                    key: 4,
                    content: vk
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