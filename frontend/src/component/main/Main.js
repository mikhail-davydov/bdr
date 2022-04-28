import {Component} from "react";

import "./Main.css";

export class Main extends Component {

    render() {
        return (
            <main className="main">
                {this.props.mainContent}
            </main>
        )
    }

}