import {Component} from "react";

import "./Contacts.css";

export class Contacts extends Component {

    render() {
        return (
            <div className="contacts-container">
                <ul className="contacts__list">
                    <li className="contacts__item">phone</li>
                    <li className="contacts__item">email</li>
                    <li className="contacts__item">telegram</li>
                    <li className="contacts__item">vk</li>
                </ul>
            </div>
        )
    }

}