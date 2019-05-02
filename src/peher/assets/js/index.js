import React from 'react';
import ReactDOM from 'react-dom';
window.React = React;
window.ReactDOM = ReactDOM;

class YoutubePlayer extends React.Component {
  constructor(props) {
    super(props);

    this.state = { list: [], current_track: 0 };

    this.fetchList();
  }

  fetchList() {
    fetch('/music-list')
      .then(data => {
        return data.json();
      })
      .then(response => {
        this.setState({list: response})
      });
  }

  render() {
    if (this.state.list.length > 0) {
      const track = this.state.list[this.state.current_track]
      return (
        <div>
          <p>{track.title}</p>
          <div data-video={track.id}
               data-autoplay="0"
               data-loop="1"
               id="youtube-audio">
          </div>
        </div>
      );
    } else {
      return null;
    }
  }
}


ReactDOM.render(<YoutubePlayer/>, document.getElementById('yt-player'));
