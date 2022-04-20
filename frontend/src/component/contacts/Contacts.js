import {Component} from "react";
import Icon from "../icon/Icon";

import "./Contacts.css";

export class Contacts extends Component {

    constructor(props) {
        super(props);
        this.state = {
            contacts: [
                {
                    key: 1,
                    content: "call"
                },
                {
                    key: 2,
                    content: "email"
                },
                {
                    key: 3,
                    content: "telegram"
                },
                {
                    key: 4,
                    content: "vk"
                },
            ]
        }
    }

    render() {
        let iconContent =
            <svg xmlns="http://www.w3.org/2000/svg"
                 viewBox="0 0 122.88 122.88">
                <path className="cls-1"
                      d="M61.44,0A61.44,61.44,0,1,1,0,61.44,61.44,61.44,0,0,1,61.44,0ZM30.73,38,62,63.47,91.91,38Zm-2,42.89L51,58.55,28.71,40.39V80.87ZM53.43,60.55l-22.95,23H92.21l-21.94-23L63,66.71h0a1.57,1.57,0,0,1-2,0l-7.59-6.19Zm19.24-2,21.5,22.54V40.19L72.67,58.51Z"/>
            </svg>;

        let contacts = this.state.contacts.map(contact => {
            // let iconContent =
            //     <svg xmlns="http://www.w3.org/2000/svg"
            //          viewBox="0 0 122.88 122.88">
            //         <path className="cls-1"
            //               d={contact.content}/>
            //     </svg>;
            return <li className="contacts__item" key={contact.key}>
                <a className="contacts__link" href="#">
                    <Icon class="contacts__item-icon" content={iconContent}/>
                </a>
            </li>
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